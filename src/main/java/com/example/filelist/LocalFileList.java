package com.example.filelist;

import java.io.File;

/**
 * @author innokenty
 */
public class LocalFileList extends FileList<LocalFileListEntry> {

    public LocalFileList() {
        this(getDefaultStartingFolder());
    }

    public LocalFileList(File startingFolder) {
        super(new LocalFileListModel(startingFolder));

    }

    private static File getDefaultStartingFolder() {
        String homeDirPath = System.getProperty("user.home");
        //noinspection ConstantConditions
        return homeDirPath != null || new File(homeDirPath).isDirectory()
                ? new File(homeDirPath)
                : new File(System.getProperty("user.dir"));
    }
}