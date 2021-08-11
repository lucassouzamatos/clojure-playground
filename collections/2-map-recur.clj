(ns map-recur)

(defn map-on-nail
  [fun values]
  (let [value (first values)]
    (if (not (nil? value))
      (do 
        (fun value)
        (recur fun (rest values)) ;; tail recursion
      ))))

(map-on-nail println (range 5000))
