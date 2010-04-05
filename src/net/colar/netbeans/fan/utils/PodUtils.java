/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.File;

/**
 *
 * @author bheadley
 */
public class PodUtils {
    public static String getPodFullDescription(File f) {
        if (f.isDirectory()) {
            return f.getAbsolutePath();
        }
        if (!f.getName().endsWith("pod")) {
            return "huh? - " + f.getName();
        }
        String version = "";
        String podDesc = "";
        String podName = "";
        boolean hasVersion = false;
        boolean hasName = false;
        boolean hasDesc = false;
        ZipFile zipFile = null;
        BufferedReader is = null;
        try {
            zipFile = new ZipFile(f.getPath());
            ZipEntry zipEntry = zipFile.getEntry("meta.props");
            if (zipEntry == null) {
                return "";
            }
            is = new BufferedReader(new InputStreamReader(
                    zipFile.getInputStream(zipEntry)));
            while (true) {
                final String line = is.readLine();
                if (line.startsWith("pod.version")) {
                    final String[] tokens = line.split("=");
                    version = tokens[1].trim();
                    hasVersion = true;
                }
                else if (line.startsWith("pod.name")) {
                    final String[] tokens = line.split("=");
                    podName = tokens[1].trim();
                    hasName = true;
                }
                else if (line.startsWith("pod.summary")) {
                    final String[] tokens = line.split("=");
                    podDesc = tokens[1].trim();
                    hasDesc = true;
                }
                if (hasDesc && hasName && hasVersion) {
                    return podName + " " + version + " " + podDesc;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (null != is) {
                try {is.close();} catch (Exception e1) {}
            }
            if (null != zipFile) {
                try {zipFile.close();} catch (Exception e1) {}
            }
        }
        return "";
    }
    public static String getPodShortDescription(File f) {
        String version = "";
        String podName = "";
        boolean hasVersion = false;
        boolean hasName = false;
        ZipFile zipFile = null;
        BufferedReader is = null;
        try {
            zipFile = new ZipFile(f.getPath());
            ZipEntry zipEntry = zipFile.getEntry("meta.props");
            if (zipEntry == null) {
                return "";
            }
            is = new BufferedReader(new InputStreamReader(
                    zipFile.getInputStream(zipEntry)));
            while (true) {
                final String line = is.readLine();
                if (line.startsWith("pod.version")) {
                    final String[] tokens = line.split("=");
                    version = tokens[1].trim();
                    hasVersion = true;
                }
                else if (line.startsWith("pod.name")) {
                    final String[] tokens = line.split("=");
                    podName = tokens[1].trim();
                    hasName = true;
                }
                if (hasName && hasVersion) {
                    return podName + " " + version ;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (null != is) {
                try {is.close();} catch (Exception e1) {e1.printStackTrace();}
            }
            if (null != zipFile) {
                try {zipFile.close();} catch (Exception e1) {e1.printStackTrace();}
            }
        }
        return "";
    }
}
