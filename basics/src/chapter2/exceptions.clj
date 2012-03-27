(defn throw-catch [f]
  (try
     (f)
     (catch ArithmeticException e
       "Arithmetic ex")
     (catch Exception e
       (str "Stop: " (.getMessage e)))))

(throw-catch #(/ 10 0)) ; => "Arithmetic ex
(throw-catch #(throw (Exception. "Hammertime"))) ; => Arithmetic ex

