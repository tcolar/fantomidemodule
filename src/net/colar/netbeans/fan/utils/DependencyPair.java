/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.utils;

/**
 *
 * @author bheadley
 */
public class DependencyPair implements Comparable<DependencyPair> {
    private String podName;
    private String version;

    public DependencyPair(String name, String ver) {
        podName = name;
        version = ver;
    }
    public String getPodName() {
        return podName;
    }
    public String getVersion() {
        return version;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != this && obj instanceof DependencyPair) {
            final DependencyPair other = (DependencyPair) obj;
            return podName.equals(other.podName);
        }
        return false;
    }
    @Override
    public int compareTo(DependencyPair other) {
        return podName.compareTo(other.podName);
    }

    @Override
    public int hashCode() {
        return podName.hashCode();
    }

}
