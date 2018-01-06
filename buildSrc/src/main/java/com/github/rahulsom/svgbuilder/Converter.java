package com.github.rahulsom.svgbuilder;

import com.thaiopensource.relaxng.translate.Driver;

public class Converter {
    public void convert() {
        new Driver().run(new String[]{
                "-I", "dtd",
                "-O", "xsd",
                "build/schemas/svg.dtd",
                "build/schemas/svg.xsd"
        });
    }
}
