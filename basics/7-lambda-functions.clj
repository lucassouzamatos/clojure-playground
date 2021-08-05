(ns lambda-functions)

(defn discounted-value
  "returns the discounted value when value is more then 100"
  [apply? value]
  (if (apply? value)
    (let [rate-discount (/ 10 100)
          discount      (* value rate-discount)]
      (- value discount))
    value))

(println (discounted-value (fn [value] (> value 100)) 100))

;; exec a function when %1 is the first arg
(println (discounted-value #(> %1 100) 100)) 

;; when has only one arg just use %
(println (discounted-value #(> % 100) 100)) 

;; naming the lambda functions
(def rule (fn [value] (> value 100)))
(println (discounted-value rule 100)) 

(def rule-min #(> % 100))
(println (discounted-value rule-min 100)) 
