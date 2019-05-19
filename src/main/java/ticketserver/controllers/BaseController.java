package ticketserver.controllers;

import ticketserver.model.BaseEntity;
import ticketserver.services.BaseService;

public abstract class BaseController<T extends BaseEntity> {
  protected abstract BaseService<T, String> getBaseService();
}
