import { fizzBuzz } from "../src/FizzBuzz";

describe("FizzBuzz", () => {
    it.skip("should pass the acceptance test", () => {
        // /!\ Should only pass at the end:
        // - Keep skipped
        // - Write and pass intermediate tests
        // - Un-skip at the end when should be passing
        // /!\ IF YOU PASS IT... YOU MIGHT HAVE GONE TOO FAST!

        expect(fizzBuzz(90)).toBe("FizzBuzz");
        expect(fizzBuzz(91)).toBe("91");
        expect(fizzBuzz(92)).toBe("92");
        expect(fizzBuzz(93)).toBe("Fizz");
        expect(fizzBuzz(94)).toBe("94");
        expect(fizzBuzz(95)).toBe("Buzz");
        expect(fizzBuzz(96)).toBe("Fizz");
        expect(fizzBuzz(97)).toBe("97");
        expect(fizzBuzz(98)).toBe("98");
        expect(fizzBuzz(99)).toBe("Fizz");
        expect(fizzBuzz(100)).toBe("Buzz");
    });
});