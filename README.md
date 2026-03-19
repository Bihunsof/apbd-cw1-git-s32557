### 1. Kiedy Git wykona fast-forward, a kiedy powstaje merge commit?
Git wykona fast-forward wtedy, gdy gałąź docelowa nie ma nowych commitów od momentu utworzenia gałęzi feature. Merge commit powstaje wtedy, gdy obie gałęzie mają już własne, niezależne zmiany.

### 2. Czym w praktyce różni się merge od rebase?
Merge zachowuje rozgałęzioną historię i zwykle tworzy merge commit. Rebase przepisuje commity tak, jakby powstały na najnowszej wersji gałęzi głównej, przez co historia jest bardziej liniowa i czytelna.

### 3. W jaki sposób został rozwiązany konflikt w Twoim repozytorium?
Konflikt został wywołany przez zmianę tego samego fragmentu kodu na gałęzi feature-conflict i na gałęzi głównej. Został rozwiązany ręcznie przez wybranie końcowej, świadomej wersji kodu, tak aby program nadal działał poprawnie.