package me.champeau.groovybench

import org.openjdk.jmh.annotations.*
import groovy.transform.CompileStatic

@State(Scope.Benchmark)
class StringConcat {
    private String a
    private String b
    private int x
    private double y

    @Setup
    void setUp() {
        a = 'The quick brown fox'
        b = 'jumps over the lazy dog'
        x = 1
        y = 2
    }

    @Benchmark
    String simple() {
        a + ' ' + b + ' ' + x + ' ' + y
    }

    @Benchmark
    @CompileStatic
    String simpleStatic() {
        a + ' ' + b + ' ' + x + ' ' + y
    }

    @Benchmark
    String gstring() {
        "$a $b $x $y"
    }

    @Benchmark
    @CompileStatic
    String gstringStatic() {
        "$a $b $x $y"
    }
    
    @Benchmark
    String stringBuilder() {
        new StringBuilder()
                .append(a).append(' ').append(b).append(' ').append(x).append(' ').append(y)
    }

    @Benchmark
    @CompileStatic
    String stringBuilderStatic() {
        new StringBuilder()
                .append(a).append(' ').append(b).append(' ').append(x).append(' ').append(y)
    }

}
