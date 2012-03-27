(ns examples.fizzbuzz)

(defn fizz-buzz [val]
  (cond
    (zero? (mod val 15)) "Fizzbuzz"
    (zero? (mod val 5)) "Buzz"
    (zero? (mod val 3)) "Fizz"
     :else val))

(defn fizz-buzzer [from to]
  (map #(fizz-buzz %1) (range from to)))
