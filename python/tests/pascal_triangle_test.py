from slow_code.pascal_triangle import line
import pytest


class TestPascalTriangle:

    # /!\ Should only pass at the end:
    # - Keep skipped
    # - Write and pass intermediate tests
    # - Un-skip at the end when should be passing
    @pytest.mark.skip(reason="test currently disabled")
    def test_acceptance(self):
        assert line(0) == [1]
        assert line(1) == [1, 1]
        assert line(2) == [1, 2, 1]
        assert line(3) == [1, 3, 3, 1]
        assert line(4) == [1, 4, 6, 4, 1]
        assert line(5) == [1, 5, 10, 10, 5, 1]
        assert line(6) == [1, 6, 15, 20, 15, 6, 1]
        assert line(7) == [1, 7, 21, 35, 35, 21, 7, 1]
        # ...
        assert line(15) == [1, 15, 105, 455, 1365, 3003, 5005, 6435, 6435, 5005, 3003, 1365, 455, 105, 15, 1]
