(defn discounted-value
  "returns the discounted value"
  [value]
  (let [rate-discount (/ 10 100)
        discount      (* value rate-discount)]
    (- value discount)))

(println (discounted-value 100))