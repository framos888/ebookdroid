package org.emdev.common.textmarkup;


public enum MarkupTag {

    JustificationMode(1),
    MarkupEndDocument(0),
    MarkupEndPage(0),
    MarkupExtraSpace(4),
    MarkupImageRef(-1),
    MarkupSpace(0),
    MarkupNoSpace(0),
    MarkupNote(-1),
    MarkupParagraphEnd(0),
    MarkupTitle(-1),

    HorizontalRule(8),
    Image(0),
    LineFixedWhiteSpace(8),
    LineWhiteSpace(8),
    MultiLineElement(0),
    TextElement(36);

    public final int size;
    public final boolean fixed;
    public final boolean empty;

    private MarkupTag(final int size) {
        this.size = size;
        this.fixed = size == -1;
        this.empty = size == 0;
    }
}
