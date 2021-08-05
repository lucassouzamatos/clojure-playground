(ns functions)

;; pass a function as a parameter
;; ! high order functions !

(defn apply-discount-rule?
  [value]
  (> value 100))

(defn discounted-value
  "returns the discounted value when value is more then 100"
  [apply? value]
  (if (apply? value)
    (let [rate-discount (/ 10 100)
          discount      (* value rate-discount)]
      (- value discount))
    value))

(println (discounted-value apply-discount-rule? 100))
