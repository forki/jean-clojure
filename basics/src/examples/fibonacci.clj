; Simple recursive fibonacci
(defn fibonacci [x]
  (if (< x 2)
    x
    (+ (fibonacci(- x 2))
       (fibonacci (dec x)))))

(fibonacci 0)
(fibonacci 1)
(fibonacci 2)
(fibonacci 3)

