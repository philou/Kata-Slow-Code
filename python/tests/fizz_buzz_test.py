from slow_code.fizz_buzz import fizz_buzz
import pytest


class TestFizzBuzz:

    @pytest.mark.skip(reason="test currently disabled")
    def test_acceptance_test(self) -> None:
        # /!\ Should only pass at the end:
        # - Keep skipped
        # - Write and pass intermediate tests
        # - Un-skip at the end when should be passing

        assert fizz_buzz(90) == "FizzBuzz"
        assert fizz_buzz(91) == "91"
        assert fizz_buzz(92) == "92"
        assert fizz_buzz(93) == "Fizz"
        assert fizz_buzz(94) == "94"
        assert fizz_buzz(95) == "Buzz"
        assert fizz_buzz(96) == "Fizz"
        assert fizz_buzz(97) == "97"
        assert fizz_buzz(98) == "98"
        assert fizz_buzz(99) == "Fizz"
        assert fizz_buzz(100) == "Buzz"
