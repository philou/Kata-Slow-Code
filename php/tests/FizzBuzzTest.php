<?php
namespace SlowKata\Tests;
use SlowKata\FizzBuzz;
use PHPUnit\Framework\TestCase;

class FizzBuzzTest extends TestCase
{
    /** @test */
    public function AcceptanceTests()
    {
        // /!\ Should only pass at the end:
        // - Keep disabled
        // - Write and pass intermediate tests
        // - Enable at the end when should be passing
        // /!\ IF YOU PASS IT... YOU MIGHT HAVE GONE TOO FAST!
        $this->markTestSkipped('this test could eventually be run once a full implementation has been written');
        $fizzBuzz = new FizzBuzz();
        $this->assertEquals('1', $fizzBuzz->say(1));
        $this->assertEquals('2', $fizzBuzz->say(2));
        $this->assertEquals('Fizz', $fizzBuzz->say(3));
        $this->assertEquals('Buzz', $fizzBuzz->say(5));
        $this->assertEquals('FizzBuzz', $fizzBuzz->say(15));
    }
}