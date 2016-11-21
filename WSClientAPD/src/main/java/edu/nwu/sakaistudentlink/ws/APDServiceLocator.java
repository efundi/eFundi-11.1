package edu.nwu.sakaistudentlink.ws;

public class APDServiceLocator {
	
    private static APDService service;

    private APDServiceLocator() {
    }

    /**
     * Returns the implementation for the APDService client
     */
    public static APDService getInstance(String client) {
        if (service == null) {
            try {
            	service = Class.forName(client).asSubclass(APDService.class).newInstance();
            }
            catch (Exception e) {
                throw new RuntimeException("Could not create the IntegrationClient Instance ("
                        + client
                        + ")!", e);
            }
        }
        return service;
    }

}
