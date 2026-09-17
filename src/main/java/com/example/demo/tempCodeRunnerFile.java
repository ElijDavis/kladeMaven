    public String home() {
        String testEnv = System.getenv("TEST_ENV_VAR");
        return "Test Env: " + (testEnv != null ? testEnv : "Not Found");
    }