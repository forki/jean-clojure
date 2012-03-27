; Using tail recursion with recur
(defn print-down-from [x]
  (when (pos? x) ; when is used when no else branch exists and you've side effects
    (println x)
    (recur (dec x))))

; A function with an accumulator
; (macro symbol persistentvector)
(defn sum-down-from [sum x]
  (if (pos? x)
    (recur (+ sum x) (dec x)) ; if branch
    sum)); else branch

(defn sum-down-from2 [initial-x]
  (loop [sum 0, x initial-x]
    (if (pos? x)
      (recur (+ sum x) (dec x)); recur jumps to the nearest loop block
      sum)))

