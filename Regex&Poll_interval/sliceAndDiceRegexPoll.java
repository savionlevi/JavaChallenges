    public void waitUntilSnapshotFound(String snapshotStatus){
        await().atMost(Duration.FIVE_MINUTES)
                .ignoreExceptions()
                .pollInterval(Duration.FIVE_SECONDS)
                .conditionEvaluationListener(condition -> {
                    if (!condition.isSatisfied()) {
                        try {
                            checkSnapperSnapshotStatus(snapshotStatus);
                            StepsLogger.log("checking if snapshot is at this state: "+snapshotStatus, true, true, "blue", false);
                        } catch (Exception e) {
                            StepsLogger.log("Exception when trying to check snapshot status [" + e.getMessage() + "]");
                        }
                    }
                }).until(() -> checkSnapperSnapshotStatus(snapshotStatus));
    }


    public boolean checkSnapperSnapshotStatus(String snapshotStatus) throws Exception {

        boolean snapshotFound = false;
        String path="/"
        String response = this.execute(commandBuilder.cat(path).build());
        StepsLogger.logBold(response,true);
        Pattern regex = Pattern.compile(snapshotStatus);

        Matcher matcher = regex.matcher(response);
        if(matcher.find()){
            if(matcher.group(0).contains(snapshotStatus)) {
                StepsLogger.logBold("Snapshot found: "+snapshotStatus,true);
                snapshotFound = true;
            }
        }
        return snapshotFound;
    }
