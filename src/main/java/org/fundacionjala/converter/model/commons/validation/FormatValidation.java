package org.fundacionjala.converter.model.commons.validation;

import org.fundacionjala.converter.model.commons.exception.InvalidDataException;

import java.util.ArrayList;
import java.util.List;

public class FormatValidation implements IValidationStrategy {
    private String format;
    public static final String FORMAT_TXT = ".txt";
    public static final String FORMAT_DOCX = ".docx";
    public static final String FORMAT_PDF = ".pdf";
    public static final String FORMAT_MP4 = ".mp4";
    public static final String FORMAT_GIF = ".gif";
    public static final String FORMAT_MOV = ".mov";
    private List<String> formatsAllowed;

    public FormatValidation(final String format) {
        this.format = format;
        formatsAllowed = new ArrayList<>();
        formatsAllowed.add(FORMAT_TXT);
        formatsAllowed.add(FORMAT_DOCX);
        formatsAllowed.add(FORMAT_PDF);
        formatsAllowed.add(FORMAT_MP4);
        formatsAllowed.add(FORMAT_GIF);
        formatsAllowed.add(FORMAT_MOV);
    }

    /**
     * @throws InvalidDataException
     */
    @Override
    public void validate() throws InvalidDataException {
        if (!formatsAllowed.contains(this.format)) {
            throw new InvalidDataException("Invalid format");
        }
    }
}
