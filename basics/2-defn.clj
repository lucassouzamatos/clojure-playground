;; when the function has not parameter, its necessary add [] as argument
(defn print-message []
  (println "hello world function"))

(print-message)

;; function that return a discount calculed
(defn apply-discount [value]
  (* value 10))

(apply-discount 10)