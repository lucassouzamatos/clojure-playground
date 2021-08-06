(ns map-filter)

(defn apply-discount?
  [value]
  (> value 100))

(defn discounted-value
  "returns the discounted value when value is more then 100"
  [value]
  (if (apply-discount? value)
    (let [rate-discount (/ 10 100)
          discount      (* value rate-discount)]
      (- value discount))
    value))

(def prices [30 70 1000])

(println (map discounted-value prices))

(println (range 10)) ;; creates a vector as [0, 1 ... 9]

(println (filter even? (range 10))) ;; filter values

(println (filter apply-discount? prices)) ;; filter values that can apply discount
