/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.project;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import net.jot.web.views.JOTLightweightView;
import net.colar.netbeans.fan.templates.TemplateUtils;
import net.colar.netbeans.fan.templates.TemplateView;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import net.colar.netbeans.fan.FanUtilities;
import org.openide.filesystems.URLMapper;
import org.openide.util.Exceptions;

/**
 *
 * @author bheadley
 */
public class FanBuild {
    public FanBuild(String projectFolder) {
        this.projectFolder = projectFolder;
    }
    public boolean parse() {
        String folder = projectFolder;
        if (!folder.endsWith(File.separator)) {
            folder += File.separator;
        }
        final File buildFan = new File(folder, "build.fan");
        if (buildFan.exists())
        {
            try {
                final fan.sys.File buildFile = new fan.sys.LocalFile(buildFan);
                final fan.sys.FanObj script = (fan.sys.FanObj) fan.sys.Env.cur().compileScript(buildFile).make();
                final String buildType = script.typeof().base().name();
                String pod;
                if(buildType.equals("BuildPod"))
                {
                    pod = (String) script.typeof().field("podName").get(script);
                }
                else
                {
                    pod = folder;
                }
                setPodName(pod);

                final String description = (String) script.typeof().field("summary").get(script);
                setPodDescription(description);

                final fan.sys.Version verObj = (fan.sys.Version) script.typeof().field("version").get(script);
                final String version = fan.sys.Version.toStr(verObj);
                setPodVersion(version);

                final fan.sys.Uri outDr = (fan.sys.Uri) script.typeof().field("outDir").get(script);
                final String out = outDr.toStr();
                setOutputDirectory(out);

                Boolean docApi_ = (Boolean) script.typeof().field("docApi").get(script);
                if (null == docApi_) {
                    docApi_ = Boolean.FALSE;
                }
                setDocApi(docApi_);

                Boolean docSrc_ = (Boolean) script.typeof().field("docSrc").get(script);
                if (null == docSrc_) {
                    docSrc_ = Boolean.FALSE;
                }
                setDocSrc(docSrc_);

                StringBuilder sb = new StringBuilder();
                final fan.sys.List depObj = (fan.sys.List) script.typeof().field("depends").get(script);
                if (null != depObj) {
                    for (long i = 0; i < depObj.size(); i++ ) {
                        final String s = (String) depObj.get(i);
                        sb.append("\"");
                        sb.append(s.trim());
                        sb.append("\"");
                    }
                }
                setDependencies(sb.toString());

                sb = new StringBuilder();
                final fan.sys.List srcObj = (fan.sys.List) script.typeof().field("srcDirs").get(script);
                if (null != srcObj) {
                    for (long i = 0; i < srcObj.size(); i++ ) {
                        fan.sys.Uri u = (fan.sys.Uri) srcObj.get(i);
                        String s = u.toStr();
                        s = folder + s;
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append("`");
                        sb.append(s);
                        sb.append("`");
                    }
                }
                setSourceDirs(sb.toString());

                sb = new StringBuilder();
                final fan.sys.List resObj = (fan.sys.List) script.typeof().field("resDirs").get(script);
                if (null != resObj) {
                    for (long i = 0; i < resObj.size(); i++ ) {
                        fan.sys.Uri u = (fan.sys.Uri) srcObj.get(i);
                        String s = u.toStr();
                        s = folder + s;
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append("`");
                        sb.append(s);
                        sb.append("`");
                    }
                }
                setResourceDirs(sb.toString());

                final fan.sys.Map idxObj = (fan.sys.Map) script.typeof().field("index").get(script);
                if (null != idxObj) {
                    final fan.sys.List idxKeys = idxObj.keys();
                    for (long i = 0; i < idxKeys.size(); i++ ) {
                        final String k = (String) idxKeys.get(i);
                        final String v = (String) idxObj.get(k);
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append("\"");
                        sb.append(k);
                        sb.append("\" : \"");
                        sb.append(v);
                        sb.append("\"");
                    }
                }
                setIndex(sb.toString());

                sb = new StringBuilder();
                final fan.sys.Map metObj = (fan.sys.Map) script.typeof().field("meta").get(script);
                if (null != metObj) {
                    final fan.sys.List metKeys = metObj.keys();
                    for (long i = 0; i < metKeys.size(); i++ ) {
                        final String k = (String) metKeys.get(i);
                        final String v = (String) metObj.get(k);
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append("\"");
                        sb.append(k);
                        sb.append("\" : \"");
                        sb.append(v);
                        sb.append("\"");
                    }
                }
                setMeta(sb.toString());
                return true;
            } catch (Exception ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        return false;
    }
    public void create(String templateURI) {
        try {
            String folder = projectFolder;
            if (!folder.endsWith(File.separator)) {
                folder += File.separator;
            }
            final FileObject buildTemplate = URLMapper.findFileObject(URI.create(templateURI).toURL());
            final JOTLightweightView view = new TemplateView(buildTemplate, getPodName());
            view.addVariable("desc", getPodDescription());
            view.addVariable("version", getPodVersion());
            view.addVariable("dependencies", getDependencies());
            view.addVariable("srcDirs", getSourceDirs());
            view.addVariable("resDirs", getResourceDirs());
            view.addVariable("outDir", getOutputDirectory().replaceAll(File.separator, "/"));
            view.addVariable("indexes", getIndex());
            view.addVariable("metas", getMeta());
            view.addVariable("docSrc", Boolean.toString(getDocSrc()));
            view.addVariable("docApi", Boolean.toString(getDocApi()));
            final File buildFile = new File(folder, "build.fan");
            if (buildFile.exists()) {
                buildFile.delete();
            }
            final FileObject buildFo = FileUtil.toFileObject(FileUtil.normalizeFile(buildFile));
            final FileObject license = FanUtilities.getRelativeFileObject(buildTemplate, "../../Licenses/FanDefaultLicense.txt");
            view.addVariable("license", license.asText());
            String buildText = buildTemplate.asText();

            // create build.fan
            TemplateUtils.createFromTemplate(view, buildText, buildFile);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
    public String getDependencies() {
        return dependencies;
    }

    public void setDependencies(String dependencies) {
        this.dependencies = dependencies;
    }

    public boolean getDocApi() {
        return docApi;
    }

    public void setDocApi(boolean docApi) {
        this.docApi = docApi;
    }

    public boolean getDocSrc() {
        return docSrc;
    }

    public void setDocSrc(boolean docSrc) {
        this.docSrc = docSrc;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public String getOutputDirectory() {
        return outDir;
    }

    public void setOutputDirectory(String outDir) {
        this.outDir = outDir;
    }

    public String getPodDescription() {
        return podDescription;
    }

    public void setPodDescription(String podDescription) {
        this.podDescription = podDescription;
    }

    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    public String getPodVersion() {
        return podVersion;
    }

    public void setPodVersion(String podVersion) {
        this.podVersion = podVersion;
    }

    public String getResourceDirs() {
        return resDirs;
    }

    public void setResourceDirs(String resDirs) {
        this.resDirs = resDirs;
    }

    public String getSourceDirs() {
        return srcDirs;
    }

    public void setSourceDirs(String srcDirs) {
        this.srcDirs = srcDirs;
    }
    private String projectFolder;
    private String podName;
    private String podDescription;
    private String podVersion;
    private boolean docSrc;
    private boolean docApi;
    private String outDir;
    private String dependencies;
    private String index;
    private String meta;
    private String srcDirs;
    private String resDirs;
}
