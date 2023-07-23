package ir.edu.farhadi.java.j15.lombda.fanap.simple;

import com.googlecode.gwt.crypto.util.Str;

@FunctionalInterface
public interface Logger {
//    void doLog();
//    void doLog(String systemName);

    String getLog(String systemName);
}
