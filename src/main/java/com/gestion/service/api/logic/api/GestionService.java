package com.gestion.service.api.logic.api;

import com.gestion.service.api.to.AdherentTo;
import com.gestion.service.api.to.MessageTo;

public interface GestionService {

    MessageTo getMessage();

    AdherentTo getAdherentById(Long id);
}
