package com.weijielam.collaboration_mapper;

class LegalEntityNotFoundException extends RuntimeException {

    LegalEntityNotFoundException(Long id) {
        super("Could not find employee" + id);
    }
}
