package org.lightadmin.demo.config;

import org.lightadmin.core.annotation.Administration;
import org.lightadmin.core.view.ScreenContext;
import org.lightadmin.core.view.support.Fragment;
import org.lightadmin.core.view.support.FragmentBuilder;
import org.lightadmin.demo.model.Address;

@Administration( Address.class )
public class AddressAdministration {

	public static void configureScreen( ScreenContext screenContext ) {
		screenContext.screenName( "Addresses Administration" ).menuName( "Addresses" );
	}

	public static Fragment listView( FragmentBuilder fragmentBuilder ) {
		return fragmentBuilder
			.field("country").alias( "Country")
			.field("city").alias("City")
			.field("street").alias("Street").build();
	}
}