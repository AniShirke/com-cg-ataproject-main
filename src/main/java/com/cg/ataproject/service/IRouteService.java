package com.cg.ataproject.service;

import java.util.List;

import com.cg.ataproject.model.Route;

public interface IRouteService {
	
	public abstract List<Route> viewAllRoutes();

	public abstract Route viewRouteById(int routeId);

	public abstract Route addRoute(Route route);

	public abstract Route modifyRoute(Route route);
	
	public abstract Route deleteRoute(int routeId);
}
