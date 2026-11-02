QUnit.module("numberConverter tesztek");

//1
QUnit.test("negatív", function(assert) {
    let result = numberConverter(-1)
    assert.strictEqual(result, 1, "-1 re 1-es hibakód");
});
//2
QUnit.test("NaN", function(assert) {
    let result = numberConverter("a")
    assert.strictEqual(result, 1, "NaN-ra 1-es hibakód");
});
//3
QUnit.test("tört", function(assert) {
    let result = numberConverter(1.1)
    assert.strictEqual(result, 1, "1.1 re 1-es hibakód");
});
//4
QUnit.test("3999 fölött", function(assert) {
    let result = numberConverter(4000)
    assert.strictEqual(result, 1, "4000 re 1-es hibakód");
});
//5
QUnit.test("1-9", function(assert) {
    let result = numberConverter(5)
    assert.strictEqual(result, "V", "5-re V");
});
//6
QUnit.test("100-900", function(assert) {
    let result = numberConverter(456)
    assert.strictEqual(result, "CDLVI", "456 -ra CDLVI");
});
