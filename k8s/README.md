# Manifests Kubernetes

```bash
kubectl apply -k k8s/base
kubectl get pods -n projet
```

À ajouter au fur et à mesure dans `base/` (et dans `kustomization.yaml`) :
- gateway (Ingress ou Istio) — 12/20
- base de données PostgreSQL — 16/20
- RBAC, mTLS — 18/20
