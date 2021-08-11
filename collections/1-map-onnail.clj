(ns mymap)

(defn map-on-nail
  [fun values]
  (let [value (first values)]
    (if (not (nil? value))
      (do 
        (fun value)
        (map-on-nail fun (rest values))    
      ))))

(map-on-nail println ["el 1" "el 2" "el 3"])