/** Copyright 2014 Unkn0wn0ne

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License. **/
package com.Unkn0wn0ne.unknownnet.server.util;

public interface PoolableObject {
	/**
	 * UnknowNet has a focus on attempting to reduce allocations so that the GC isn't causing framerate loss or slowing down the network threads. This method simply acts as a constructor for your packet object. Allow variables should be assigned here.
	 * @param vars
	 */
	public void setVariables(Object... vars);
	
	/**
	 * Called to clear variables after a packet has fulfilled it's purpose. UnknownNet calls this automatically.
	 */
	public void resetVariables();
}
