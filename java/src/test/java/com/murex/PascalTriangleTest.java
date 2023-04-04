/*
Copyright (c) 2021 Murex

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package com.murex;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PascalTriangleTest {
    @Ignore
    @Test
    public void acceptance_test() {
        char line = '7';
        String expected = ""
                + "1\n"
                + "1 1\n"
                + "1 2 1\n"
                + "1 3 3 1\n"
                + "1 4 6 4 1\n"
                + "1 5 10 10 5 1\n"
                + "1 6 15 20 15 6 1\n"
                + "1 7 21 35 35 21 7 1\n";
        assertEquals(expected, PascalTriangle.draw(line));
    }
}
