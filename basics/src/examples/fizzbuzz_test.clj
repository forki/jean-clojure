(ns examples.fizzbuzz.test
  (:use clojure.test)
  (:use examples.fizzbuzz))

(deftest a-val-dividable-by-3-should-be-fizz
  (doseq [x '(3 6 9 12)]
    (let [result (fizz-buzz x)]
      (is (= result "Fizz")))))

(deftest a-val-dividable-by-5-should-be-buzz
  (doseq [x '(5 10 20 25)]
    (let [result (fizz-buzz x)]
      (is (= result "Buzz")))))

(deftest a-val-dividable-by-three-and-five-should-be-fizzbuzz
  (doseq [x '(15 30 45 60)]
    (let [result (fizz-buzz x)]
      (is (= result "Fizzbuzz")))))

(deftest every-thing-else-should-be-just-a-val
  (doseq [x '(1 2 7 13 26 73)]
    (let [result (fizz-buzz x)]
      (is (= result x)))))

(run-tests)

