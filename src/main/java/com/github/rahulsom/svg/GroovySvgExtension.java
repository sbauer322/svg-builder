package com.github.rahulsom.svg;

import java.util.function.Consumer;

public class GroovySvgExtension {
    static <T extends SVGSvgContent> T content(T self, Consumer<Context> consumer) {
        Context context = new Context();
        consumer.accept(context);

        return self;
    }
}
