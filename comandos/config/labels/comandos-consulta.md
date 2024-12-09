## Seleccionar un Pod es base label

```sh
kubectl get pods -l app=frontend
```

## Comando para listar todos los labels

```sh
kubectl get pods --show-labels
```

## Sobreescribir un label existente en un pod

```sh
kubectl label pod nginx-server app=fullstack --overwrite
```

## Comando para buscar un conjunto de labels con 'in'

```sh
kubectl get pods -l "environment in (production, development, stating)"
```