package kr.co.gubed.habit2goodpure.gpoint.filecache;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileEntry {

    private String key;
    private File file;

    public FileEntry(String key, File file) {
        this.key = key;
        this.file = file;
    }

    public InputStream getInputStream() throws IOException {
        return new BufferedInputStream(new FileInputStream(file));
    }

    public String getKey() {
        return key;
    }

    public File getFile() {
        return file;
    }

}