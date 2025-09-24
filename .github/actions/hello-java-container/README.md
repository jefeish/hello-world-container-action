## Note: 

- Docker only sees files in the build context, which by default is the folder containing **action.yml** (i.e., .github/actions/hello-action-container).

- If the Java source is outside the build context (`src/main/java/HelloAction.java`), Docker cannot see it. Therefore we moved the `src/` folder inside the build context.
