Demo Docker Project for SWE 1

Build container:
```bash
docker build -t swe/pflichtenheft .
```

Run it:
```bash
docker run --rm -p 8080:8080 swe/pflichtenheft
```