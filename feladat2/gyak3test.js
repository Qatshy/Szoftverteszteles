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

