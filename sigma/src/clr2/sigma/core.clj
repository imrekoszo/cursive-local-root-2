(ns clr2.sigma.core
  (:require
   [clr2.alpha.core] ;; doesn't show up in autocomplete, go to definition doesn't work
   [clr2.gamma.core] ;; doesn't show up in autocomplete, go to definition doesn't work
   ))

(defn sigma []
  (+ (clr2.alpha.core/alpha) ;; cannot be resolved, no navigation or usage
    (clr2.gamma.core/gamma) ;; cannot be resolved, no navigation or usage
    ))
