(ns clr2.beta.core
  (:require
   [clr2.alpha.core] ;; go to definition works but find usages doesn't find anything
   [clr2.gamma.core] ;; go to definition works but find usages doesn't find anything
   ))

;; editing is allowed despite Reader Mode

(defn beta []
  (+ (clr2.alpha.core/alpha) ;; go to def works, find usages says this is the only one
    (clr2.gamma.core/gamma) ;; go to def works, find usages says this is the only one
    ))
