(ns when)

;; ;; using if/else operators
;; (defn apply-discount?
;;   [value]
;;   (if (> value 100)
;;     true
;;     false))

;; ;; when operator must be just true (only if operator)
;; (defn apply-discount?
;;   [value]
;;   (when (> value 100)
;;     true))

;; using direct bool
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

(println (discounted-value 100))


