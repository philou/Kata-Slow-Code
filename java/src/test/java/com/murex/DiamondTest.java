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

public class DiamondTest {
    @Ignore
    @Test
    public void acceptance_test() {
        char letter = 'Z';
        String expected = ""
                + "                         A                         \n"
                + "                        B B                        \n"
                + "                       C   C                       \n"
                + "                      D     D                      \n"
                + "                     E       E                     \n"
                + "                    F         F                    \n"
                + "                   G           G                   \n"
                + "                  H             H                  \n"
                + "                 I               I                 \n"
                + "                J                 J                \n"
                + "               K                   K               \n"
                + "              L                     L              \n"
                + "             M                       M             \n"
                + "            N                         N            \n"
                + "           O                           O           \n"
                + "          P                             P          \n"
                + "         Q                               Q         \n"
                + "        R                                 R        \n"
                + "       S                                   S       \n"
                + "      T                                     T      \n"
                + "     U                                       U     \n"
                + "    V                                         V    \n"
                + "   W                                           W   \n"
                + "  X                                             X  \n"
                + " Y                                               Y \n"
                + "Z                                                 Z\n"
                + " Y                                               Y \n"
                + "  X                                             X  \n"
                + "   W                                           W   \n"
                + "    V                                         V    \n"
                + "     U                                       U     \n"
                + "      T                                     T      \n"
                + "       S                                   S       \n"
                + "        R                                 R        \n"
                + "         Q                               Q         \n"
                + "          P                             P          \n"
                + "           O                           O           \n"
                + "            N                         N            \n"
                + "             M                       M             \n"
                + "              L                     L              \n"
                + "               K                   K               \n"
                + "                J                 J                \n"
                + "                 I               I                 \n"
                + "                  H             H                  \n"
                + "                   G           G                   \n"
                + "                    F         F                    \n"
                + "                     E       E                     \n"
                + "                      D     D                      \n"
                + "                       C   C                       \n"
                + "                        B B                        \n"
                + "                         A                         \n";
        assertEquals(expected, Diamond.draw(letter));
    }
}
