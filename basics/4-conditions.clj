(if (> 500 100)
  (println "true") ;; if
  (println "false")) ;; else

(defn discounted-value
  "returns the discounted value when value is more then 100"
  [value]
  (if (> value 100)
    (let [rate-discount (/ 10 100)
          discount      (* value rate-discount)]
      (- value discount))
    value))

(println (discounted-value 100))
