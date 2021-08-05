;; when the function has not parameter, its necessary add [] as argument
(defn print-message []
  (println "hello world function"))

(print-message)

;; function that return a discount calculed
(defn apply-discount [value]
  (* value 10))

(apply-discount 10)

;; functions can receive many arguments 
(defn sum
  ([] 0)
  ([a] a)
  ([a b] (+ a b)))

(println (sum)) ;; should prints 0
(println (sum 1)) ;; should prints 1
(println (sum 1 2)) ;; should prints 3
