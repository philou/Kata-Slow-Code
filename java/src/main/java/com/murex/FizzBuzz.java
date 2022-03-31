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

public class FizzBuzz {
    public static String of(int number, String newline) {
        String middle = "" + number;

        if (number % 15 == 0)
        {
            middle = "fizzbuzz";
        }
        else if (number%3 == 0) {
            middle = "fizz";
        }
        else if (number%5 == 0) {
            middle = "buzz";
        }
        return middle + newline;
    }

    public static void upTo(int i, Terminal terminal) {
        for (int j = 1; j <= i; j++) {
            String fizzBuzz = of(j, "\n");
            terminal.print(fizzBuzz);
        }
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        run(new SystemTerminal(), number);
    }

    static void run(Terminal terminal, int number) {
        upTo(number, terminal);
    }

}
