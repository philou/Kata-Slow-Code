const PascalTriangle = require("../src/PascalTriangle");

describe('PascalTriangle', () => {
    it.skip('acceptance_test', () => {

        // /!\ Should only pass at the end:
        // - Keep skipped
        // - Write and pass intermediate tests
        // - Un-skip at the end when should be passing
        expect(PascalTriangle.line(0)).toEqual([1]);
        expect(PascalTriangle.line(1)).toEqual([1, 1]);
        expect(PascalTriangle.line(2)).toEqual([1, 2, 1]);
        expect(PascalTriangle.line(3)).toEqual([1, 3, 3, 1]);
        expect(PascalTriangle.line(4)).toEqual([1, 4, 6, 4, 1]);
        expect(PascalTriangle.line(5)).toEqual([1, 5, 10, 10, 5, 1]);
        expect(PascalTriangle.line(6)).toEqual([1, 6, 15, 20, 15, 6, 1]);
        expect(PascalTriangle.line(7)).toEqual([1, 7, 21, 35, 35, 21, 7, 1]);

        //...

        expect(PascalTriangle.line(15)).toEqual([1, 15, 105, 455, 1365, 3003, 5005, 6435, 6435, 5005, 3003, 1365, 455, 105, 15, 1]);
    });
});
