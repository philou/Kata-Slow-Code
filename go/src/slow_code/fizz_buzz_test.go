/*
Copyright (c) 2023 Murex

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

package slow_code

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func Test_fizz_buzz_acceptance_test(t *testing.T) {
	// /!\ Should only pass at the end:
	// - Keep skipped
	// - Write and pass intermediate tests
	// - Un-skip at the end when should be passing
	t.Skip("test currently disabled")

	assert.Equal(t, "FizzBuzz", fizzBuzz(90))
	assert.Equal(t, "91", fizzBuzz(91))
	assert.Equal(t, "92", fizzBuzz(92))
	assert.Equal(t, "Fizz", fizzBuzz(93))
	assert.Equal(t, "94", fizzBuzz(94))
	assert.Equal(t, "Buzz", fizzBuzz(95))
	assert.Equal(t, "Fizz", fizzBuzz(96))
	assert.Equal(t, "97", fizzBuzz(97))
	assert.Equal(t, "98", fizzBuzz(98))
	assert.Equal(t, "Fizz", fizzBuzz(99))
	assert.Equal(t, "Buzz", fizzBuzz(100))
}
