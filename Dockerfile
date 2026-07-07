FROM ubuntu:latest
LABEL authors="dorka"

ENTRYPOINT ["top", "-b"]