package com.example;

import java.io.File;
import java.io.IOException;

/**
 * @author innokenty
 */
public class TextFilePreviewBuilder implements FilePreviewBuilder {

    @Override
    public boolean supportsExtension(String extension) {
        return TextFilePreview.SUPPORTED_EXTENSIONS.contains(extension);
    }

    @Override
    public FilePreview getPreviewFor(File file) throws IOException {
        return new TextFilePreview(file);
    }
}
