package com.github.rahulsom.svg

import spock.lang.Specification

class SvgSpec extends Specification {
    private static final String EXPECTED = '''\
        <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
        <svg width="7" height="3" xmlns="http://www.w3.org/2000/svg" xmlns:ns2="http://www.w3.org/1999/xlink">
            <circle/>
            <a/>
        </svg>
        '''.stripIndent()

    void 'java builder works'() {
        expect: JavaBuilder.createSvg() == EXPECTED
    }

    void 'groovy builder works'() {
        expect: GroovyBuilder.createSvg() == EXPECTED
    }

    void 'groovy builder works with style'() {
        when: GroovyBuilder.createWithStyle()
        then: notThrown()
    }
}
